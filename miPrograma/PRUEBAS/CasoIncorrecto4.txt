
PROGRAM error_estructural;
INTEGER :: res;
INTERFACE
    FUNCTION operar (a) INTEGER :: operar;
    INTEGER, INTENT(IN) a;
    END FUNCTION operar
END INTERFACE
res = operar(5);
END PROGRAM error_estructural
FUNCTION operar (a) INTEGER :: operar;
INTEGER, INTENT(IN) a;
IF (a > 0) THEN
    operar = a * 2;
ELSE
    operar = 0;
ENDIF
CALL log_error;
END FUNCTION operar
