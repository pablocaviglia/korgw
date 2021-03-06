package com.soywiz.korui.sample

import com.soywiz.kmem.*
import com.soywiz.korag.*
import com.soywiz.korim.bitmap.*
import com.soywiz.korim.color.*
import com.soywiz.korio.*
import com.soywiz.korio.async.*
import com.soywiz.korio.lang.*
import com.soywiz.korma.geom.*
import com.soywiz.korui.*
import com.soywiz.korui.ui.*
import kotlin.coroutines.*

suspend fun main(args: Array<String>) {
    for (n in 0 until 2) {
        launchImmediately(coroutineContext) {
            Application {
                frame("Hello World") {
                    agCanvas {
                        var frame = 0
                        lateinit var tex: AG.Texture
                        onRender {
                            if (frame == 0) {
                                tex = ag.createTexture(
                                    Bitmap32(
                                        4,
                                        4
                                    ) { x, y -> if (x.isOdd && y.isOdd) Colors.RED else Colors.BLUE })
                            }
                            ag.clear(Colors.AQUAMARINE)
                            ag.createVertexBuffer(
                                floatArrayOf(
                                    0f, 0f,
                                    640f, 0f,
                                    640f, 480f
                                )
                            ).use { vertices ->
                                ag.draw(
                                    vertices,
                                    program = DefaultShaders.PROGRAM_DEBUG_WITH_PROJ,
                                    type = AG.DrawType.TRIANGLES,
                                    vertexLayout = DefaultShaders.LAYOUT_DEBUG,
                                    vertexCount = 3,
                                    uniforms = AG.UniformValues(
                                        DefaultShaders.u_ProjMat to Matrix3D().setToOrtho(Rectangle(0f, 0f, 640f, 480f), -1f, +1f)
                                    )
                                )
                            }
                            frame++
                        }
                    }
                }
            }

        }
    }
}
