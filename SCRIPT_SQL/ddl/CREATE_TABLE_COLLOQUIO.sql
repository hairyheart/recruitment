/*COLLOQUIO TABLE*/
CREATE TABLE `recruitment`.`colloquio` (
  `idcolloquio` INT NOT NULL AUTO_INCREMENT,
  `data` DATE NOT NULL,
  `ora` TIME NOT NULL,
  `stanza` INT NOT NULL,
  `esito_globale` VARCHAR(50) NOT NULL,
  `note` VARCHAR(70) NULL,
  `idesigenza` INT NOT NULL,
  `idcandidato` INT NOT NULL,
  PRIMARY KEY (`idcolloquio`),
  INDEX `fk_esigenza_idx` (`idesigenza` ASC) VISIBLE,
  INDEX `fk_candidato_idx` (`idcandidato` ASC) VISIBLE,
  CONSTRAINT `fk_esigenza`
    FOREIGN KEY (`idesigenza`)
    REFERENCES `recruitment`.`esigenza` (`idesigenza`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_candidato`
    FOREIGN KEY (`idcandidato`)
    REFERENCES `recruitment`.`candidato` (`idcandidato`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
