/*******************************************************************************
 * Copyright 2019 metaphore
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.crashinvaders.vfx.gl;

/** The interface lets to customize some extra OpenGL functionality
 * (methods yet not implemented/unsupported by the official LibGDX backends).*/
public interface VfxGlExtension {
    int getBoundFboHandle();
    Viewport getViewport();

    class Viewport {
        public int x, y, width, height;

        public Viewport set(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            return this;
        }

        public Viewport set(Viewport viewport) {
            this.x = viewport.x;
            this.y = viewport.y;
            this.width = viewport.width;
            this.height = viewport.height;
            return this;
        }

        @Override
        public String toString() {
            return "x=" + x +
                    ", y=" + y +
                    ", width=" + width +
                    ", height=" + height;
        }
    }
}
