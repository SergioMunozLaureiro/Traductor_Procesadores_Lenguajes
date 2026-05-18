PROGRAM Climatizador;
INTEGER :: temp_actual;

INTERFACE
    SUBROUTINE enfriar_rapido
    END SUBROUTINE enfriar_rapido

    SUBROUTINE set_temp(t)
        INTEGER, INTENT(IN) t;
    END SUBROUTINE set_temp

    SUBROUTINE activar_compresor
    END SUBROUTINE activar_compresor
END INTERFACE

temp_actual = 30;

IF (temp_actual > 25) CALL enfriar_rapido;
CALL set_temp(22);

END PROGRAM Climatizador

SUBROUTINE enfriar_rapido
    CALL activar_compresor;
END SUBROUTINE enfriar_rapido

SUBROUTINE activar_compresor
    INTEGER :: dummy;
    dummy = 0;
END SUBROUTINE activar_compresor

SUBROUTINE set_temp(t)
    INTEGER, INTENT(IN) t;
    temp_actual = t;
END SUBROUTINE set_temp
