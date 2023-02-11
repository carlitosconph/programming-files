
data Planeta = Tierra | Mercurio | Venus | Marte | Jupiter | Saturno | Urano | Neptuno

equivalencia :: Planeta -> Float
equivalencia Tierra = 1
equivalencia Mercurio = 0.2
equivalencia Venus = 0.61
equivalencia Marte = 1.8
equivalencia Jupiter = 11.86
equivalencia Saturno = 29.44
equivalencia Urano = 84.01
equivalencia Neptuno = 164.7

edadEn :: Float  -> Planeta -> Float
edadEn n p = n / (equivalencia p)

-- firma de la division 
-- / :: Float -> Float -> Float
