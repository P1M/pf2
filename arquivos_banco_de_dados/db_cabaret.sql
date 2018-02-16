-- MySQL Script generated by MySQL Workbench
-- Qui 01 Fev 2018 09:02:47 -03
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema db_cabaret
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_cabaret
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_cabaret` DEFAULT CHARACTER SET utf8 ;
USE `db_cabaret` ;

-- -----------------------------------------------------
-- Table `db_cabaret`.`Produtos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_cabaret`.`Produtos` (
  `idProdutos` INT(11) NOT NULL,
  `Bebidas` VARCHAR(20) NULL DEFAULT NULL,
  `Camisinha` VARCHAR(20) NULL DEFAULT NULL,
  `Cigarros` VARCHAR(20) NULL DEFAULT NULL,
  `Preco` INT(5) NULL DEFAULT NULL,
  `Quantidade` INT(5) NULL DEFAULT NULL,
  PRIMARY KEY (`idProdutos`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `db_cabaret`.`Funcionarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_cabaret`.`Funcionarios` (
  `Cargo` VARCHAR(20) NULL DEFAULT NULL,
  `Nome` VARCHAR(100) NULL DEFAULT NULL,
  `DataNasc` VARCHAR(10) NULL DEFAULT NULL,
  `Genero` VARCHAR(2) NULL DEFAULT NULL,
  `Salario` INT(10) NULL DEFAULT NULL,
  `DataAdmiss` VARCHAR(10) NULL DEFAULT NULL,
  `Cpf_Func` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`Cpf_Func`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `db_cabaret`.`Servicos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_cabaret`.`Servicos` (
  `idServicos` INT(11) NOT NULL,
  `Massagem` VARCHAR(10) NULL DEFAULT NULL,
  `Danca` VARCHAR(10) NULL DEFAULT NULL,
  `Completo` VARCHAR(10) NULL DEFAULT NULL,
  `Preco` VARCHAR(5) NULL DEFAULT NULL,
  `Funcionarios_Cpf_Func` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`idServicos`),
  INDEX `fk_Servicos_Funcionarios1_idx` (`Funcionarios_Cpf_Func` ASC),
  CONSTRAINT `fk_Servicos_Funcionarios1`
    FOREIGN KEY (`Funcionarios_Cpf_Func`)
    REFERENCES `db_cabaret`.`Funcionarios` (`Cpf_Func`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `db_cabaret`.`Quartos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_cabaret`.`Quartos` (
  `idQuartos` INT(11) NOT NULL,
  `Tipo_Quarto` VARCHAR(10) NULL DEFAULT NULL,
  `Preco_Quarto` VARCHAR(5) NULL DEFAULT NULL,
  `Hr_Entrada` VARCHAR(6) NOT NULL,
  `Hr_Saida` VARCHAR(6) NULL DEFAULT NULL,
  `Data` VARCHAR(10) NOT NULL,
  `Produtos_idProdutos` INT(11) NOT NULL,
  `Servicos_idServicos` INT(11) NOT NULL,
  PRIMARY KEY (`idQuartos`, `Hr_Entrada`, `Data`),
  INDEX `fk_Quartos_Produtos1_idx` (`Produtos_idProdutos` ASC),
  INDEX `fk_Quartos_Servicos1_idx` (`Servicos_idServicos` ASC),
  CONSTRAINT `fk_Quartos_Produtos1`
    FOREIGN KEY (`Produtos_idProdutos`)
    REFERENCES `db_cabaret`.`Produtos` (`idProdutos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Quartos_Servicos1`
    FOREIGN KEY (`Servicos_idServicos`)
    REFERENCES `db_cabaret`.`Servicos` (`idServicos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `db_cabaret`.`CadastroClientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_cabaret`.`CadastroClientes` (
  `Nome` VARCHAR(100) NULL DEFAULT NULL,
  `DataNasc` VARCHAR(10) NULL DEFAULT NULL,
  `Cpf` VARCHAR(15) NOT NULL,
  `Telefone` VARCHAR(15) NULL DEFAULT NULL,
  `Endereco` VARCHAR(70) NULL DEFAULT NULL,
  `Cidade` VARCHAR(30) NULL DEFAULT NULL,
  `Estado` VARCHAR(20) NULL DEFAULT NULL,
  `Cep` VARCHAR(10) NULL DEFAULT NULL,
  `Quartos_idQuartos` INT(11) NOT NULL,
  `Quartos_Hr_Entrada` VARCHAR(6) NOT NULL,
  `Quartos_Data` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`Cpf`),
  INDEX `fk_CadastroClientes_Quartos_idx` (`Quartos_idQuartos` ASC, `Quartos_Hr_Entrada` ASC, `Quartos_Data` ASC),
  CONSTRAINT `fk_CadastroClientes_Quartos`
    FOREIGN KEY (`Quartos_idQuartos` , `Quartos_Hr_Entrada` , `Quartos_Data`)
    REFERENCES `db_cabaret`.`Quartos` (`idQuartos` , `Hr_Entrada` , `Data`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
