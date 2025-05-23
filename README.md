# shadow-cljs build mode test

Investigating a mystery with `:dev` mode used for release builds on CI.

## Locally

**compile**:

```
❯ npx shadow-cljs compile mini
shadow-cljs - config: /Users/pez/Projects/tests/shadow-cljs.release-or-dev/shadow-cljs.edn
shadow-cljs - starting via "clojure"
[:mini] Compiling ...
###### HOOK ###### :configure mode :dev
[:mini] Build completed. (46 files, 1 compiled, 0 warnings, 0.66s)
```

**release**:

```
❯ npx shadow-cljs release mini
shadow-cljs - config: /Users/pez/Projects/tests/shadow-cljs.release-or-dev/shadow-cljs.edn
shadow-cljs - starting via "clojure"
[:mini] Compiling ...
###### HOOK ###### :configure mode :release
[:mini] Build completed. (46 files, 0 compiled, 0 warnings, 2.24s)
```

## CI

???