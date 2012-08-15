(ns glaze.demo
  (:import [org.lwjgl.opengl Display DisplayMode GL11]))


(defn setup [& {:keys [width height]
                :or {width 800
                     height 600}}]
  (Display/setDisplayMode (DisplayMode. width height)))