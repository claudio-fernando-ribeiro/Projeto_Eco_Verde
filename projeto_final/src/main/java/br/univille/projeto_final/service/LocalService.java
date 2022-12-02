package br.univille.projeto_final.service;

import java.util.List;

import org.springframework.stereotype.Service;
import br.univille.projeto_final.entity.Local;


public interface LocalService {
    List<Local> getAll();
}
