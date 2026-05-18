
PROGRAM test_parte_opcional;
INTEGER :: mascara;
CHARACTER(10) :: estado;
INTERFACE
END INTERFACE
mascara = z'A3F';
DO WHILE (.TRUE. .AND. (mascara /= 0))
    SELECT CASE (mascara)
    CASE (b'1010')
        estado = "ACTIVO";
    CASE DEFAULT
        mascara = 0;
    END SELECT
ENDDO
END PROGRAM test_parte_opcional
