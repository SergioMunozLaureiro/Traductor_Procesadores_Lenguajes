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
operar = a * 2;
END FUNCTION operarMAL