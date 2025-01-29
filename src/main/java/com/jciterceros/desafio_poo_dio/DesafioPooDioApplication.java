package com.jciterceros.desafio_poo_dio;

import com.jciterceros.desafio_poo_dio.dominio.Curso;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class DesafioPooDioApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DesafioPooDioApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Curso de Java para iniciantes");
        curso1.setCargaHoraria(10);

        log.info(curso1.getTitulo() + " - " + curso1.getDescricao() + " - " + curso1.calcularXp() + " xp" + " - " + curso1.getCargaHoraria() + " horas");

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de SQL");
        curso2.setDescricao("Curso de SQL para iniciantes");
        curso2.setCargaHoraria(20);

        log.info(curso2.getTitulo() + " - " + curso2.getDescricao() + " - " + curso2.calcularXp() + " xp" + " - " + curso2.getCargaHoraria() + " horas");
    }
}
