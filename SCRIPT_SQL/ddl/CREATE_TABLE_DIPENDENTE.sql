/*DIPENDENTE TABLE*/
CREATE TABLE `recruitment`.`dipendente` (
  `iddipendente` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(50) NOT NULL,
  `cognome` VARCHAR(45) NOT NULL,
  `email` VARCHAR(60) NOT NULL,
  `num_telefono` INT NOT NULL,
  PRIMARY KEY (`iddipendente`));
