/*RELAZIONE-SKILL-ESIGENZE TABLE*/
CREATE TABLE `recruitment`.`relazione_skill_esigenza` (
  `idskill` INT NOT NULL,
  `idesigenze` INT NOT NULL,
  PRIMARY KEY (`idskill`, `idesigenze`),
  INDEX `fk_relazione_esigenza_skill_idx` (`idesigenze` ASC) INVISIBLE,
  CONSTRAINT `fk_relazione_skill_esigenza`
    FOREIGN KEY (`idskill`)
    REFERENCES `recruitment`.`skill` (`idskill`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_relazione_esigenza_skill`
    FOREIGN KEY (`idesigenze`)
    REFERENCES `recruitment`.`esigenza` (`idesigenza`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
