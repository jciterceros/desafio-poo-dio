package com.jciterceros.desafio_poo_dio;

import com.jciterceros.desafio_poo_dio.dominio.Bootcamp;
import com.jciterceros.desafio_poo_dio.dominio.Curso;
import com.jciterceros.desafio_poo_dio.dominio.Dev;
import com.jciterceros.desafio_poo_dio.dominio.Mentoria;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

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

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria de Java para iniciantes");
        mentoria.setData(LocalDate.now());

        log.info(mentoria.getTitulo() + " - " + mentoria.getDescricao() + " - " + mentoria.calcularXp() + " xp" + " - " + mentoria.getData());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp Java Developer com mentoria e projetos");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        log.info(bootcamp.getNome() + " - " + bootcamp.getDescricao() + " - " + bootcamp.getConteudos());

        Dev dev1 = new Dev();
        dev1.setNome("João");
        dev1.inscreverBootcamp(bootcamp);
        dev1.progredir();
        dev1.progredir();

        log.info(dev1.getNome() + " - " + dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.inscreverBootcamp(bootcamp);
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();

        log.info(dev2.getNome() + " - " + dev2.calcularTotalXp());
    }
}
