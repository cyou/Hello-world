@echo off
SETLOCAL enabledelayedexpansion
 
FOR %%F IN (lib/*.jar) DO (
  SET cp=!cp!;lib/%%F%
)
echo "%cp%"
java -cp "%cp%" clojure.main %1%