PROGRAM Conversor;
REAL :: metros, pies;
INTERFACE
    FUNCTION to_feet(m) REAL :: to_feet;
        REAL, INTENT(IN) m;
    END FUNCTION to_feet
END INTERFACE
metros = 10.5;
pies = to_feet(metros);
END PROGRAM Conversor
FUNCTION to_feet(m) REAL :: to_feet;
    REAL, INTENT(IN) m;
    REAL :: factor;
    factor = 3.2808;
    to_feet = m * factor;
END FUNCTION to_feet