/*ESIGENZA TABLE*/
CREATE TABLE `recruitment`.`esigenza` (
  `idesigenza` INT NOT NULL AUTO_INCREMENT,
  `num_risorse` INT NOT NULL,
  `data_inizio` DATE NOT NULL,
  `data_fine` DATE NULL,
  `tipologia` VARCHAR(50) NOT NULL,
  `idtiporisorse` INT NOT NULL,
  `iddipendente` INT NOT NULL,
  `idbu` INT NOT NULL,
  PRIMARY KEY (`idesigenza`),
  INDEX `fk_tiporisorse_idx` (`idtiporisorse` ASC) VISIBLE,
  CONSTRAINT `fk_tiporisorse`
    FOREIGN KEY (`idtiporisorse`)
    REFERENCES `recruitment`.`tipo_risorse` (`idtiporisorse`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
	
	
	/*AGGIUNGI FOREIGN KEY*/
ALTER TABLE `recruitment`.`esigenza` 
ADD INDEX `fk_dipendente_idx` (`iddipendente` ASC) VISIBLE,
ADD INDEX `fk_bu_idx` (`idbu` ASC) VISIBLE;
;
ALTER TABLE `recruitment`.`esigenza` 
ADD CONSTRAINT `fk_dipendente`
  FOREIGN KEY (`iddipendente`)
  REFERENCES `recruitment`.`dipendente` (`iddipendente`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_bu`
  FOREIGN KEY (`idbu`)
  REFERENCES `recruitment`.`bu` (`idbu`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;