-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema professores
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema professores
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `professores` DEFAULT CHARACTER SET utf8 ;
USE `professores` ;

-- -----------------------------------------------------
-- Table `professores`.`instituto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `professores`.`instituto` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `sigla` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `professores`.`professor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `professores`.`professor` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `titulacao` VARCHAR(45) NOT NULL,
  `instituto` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_professor_instituto_idx` (`instituto` ASC) VISIBLE,
  CONSTRAINT `fk_professor_instituto`
    FOREIGN KEY (`instituto`)
    REFERENCES `professores`.`instituto` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
