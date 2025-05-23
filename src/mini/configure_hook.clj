(ns mini.configure-hook)

(defn ^:export hook
  {:shadow.build/stage :configure}
  [{:shadow.build/keys [stage mode] :as build-state} {:keys [output-to]}]
  (println "###### HOOK ######" stage "mode" mode)
  build-state)