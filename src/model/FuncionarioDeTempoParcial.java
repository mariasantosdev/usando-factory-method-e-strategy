package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class FuncionarioDeTempoParcial extends Funcionario {

        private int horaDeEntrada;
        private int horaDeSaida;

        public void setHoraDeEntrada(int horaDeEntrada) {
                this.horaDeEntrada = horaDeEntrada;
        }

        public void setHoraDeSaida(int horaDeSaida) {
                this.horaDeSaida = horaDeSaida;
        }

        @Override
        public Funcionario create(String nome) {
                FuncionarioDeTempoParcial funcionarioTempoParcial = new FuncionarioDeTempoParcial();
                double id = (Math.random() * 1001) + 1000;
                funcionarioTempoParcial.setId((long) id);
                funcionarioTempoParcial.setNome(nome);
                funcionarioTempoParcial.setSalario(new BigDecimal("2.000"));
                funcionarioTempoParcial.setHoraDeEntrada(LocalDateTime.now().getHour());
                funcionarioTempoParcial.setHoraDeSaida(LocalDateTime.now().getHour());
                return funcionarioTempoParcial;
        }

        @Override
        public String toString() {
                return "FuncionarioDeTempoParcial{" +
                        "horaDeEntrada=" + horaDeEntrada +
                        ", horaDeSaida=" + horaDeSaida +
                        "} " + super.toString();
        }
}
