/*VALUTAZIONE TABLE*/
CREATE TABLE `recruitment`.`valutazione` (
  `idvalutazione` INT NOT NULL AUTO_INCREMENT,
  `esito` VARCHAR(50) NOT NULL,
  `txt_valutazione` VARCHAR(100) NOT NULL,
  `idcolloquio` INT NOT NULL,
  `iddipendente` INT NOT NULL,
  PRIMARY KEY (`idvalutazione`),
  INDEX `fk_colloquio_idx` (`idcolloquio` ASC) VISIBLE,
  INDEX `fk_dipendente_valutazione_idx` (`iddipendente` ASC) VISIBLE,
  CONSTRAINT `fk_colloquio`
    FOREIGN KEY (`idcolloquio`)
    REFERENCES `recruitment`.`colloquio` (`idcolloquio`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_dipendente_valutazione`
    FOREIGN KEY (`iddipendente`)
    REFERENCES `recruitment`.`dipendente` (`iddipendente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
