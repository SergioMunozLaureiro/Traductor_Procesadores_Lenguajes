
PROGRAM error_anidamiento;
INTEGER :: a = 10, b = 20;
INTERFACE
END INTERFACE
IF (a > 0) THEN
    IF (b > 0) THEN
        a = a + 1;
    ENDIF
ELSE
    a = 0;
ENDIF
! Error: Intentar poner un ELSE de un IF que ya se cerró
ELSE
    b = 0;
END PROGRAM error_anidamiento
