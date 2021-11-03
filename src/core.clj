(defrecord Database [layers top-id curr-time])

(defrecord Layer [storage VAET AVET VEAT EAVT])

(defrecord Entity [id attrs])

(defn make-entity
  ([] (make-entity :db/no-id-yet))
  ([id] (Entity. id {})))
