/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rn;

import com.mycompany.dao.GenericDAO;
import com.mycompany.entidade.Professor;
import java.util.List;

/**
 *
 * @author Kevin
 */
public class ProfessorRN {

    private final GenericDAO<Professor> PROFESSOR_DAO = new GenericDAO<>();
    
    public boolean salvar(Professor professor) {
        if (professor == null) {
            return false;
        } else {
            if (professor.getId() == null || professor.getId() == 0) {
                return PROFESSOR_DAO.criar(professor);
            } else {
                return PROFESSOR_DAO.alterar(professor);
            }
        }
    }
    
    public List<Professor> listar() {
        return PROFESSOR_DAO.obterTodos(Professor.class);
    }
    
    public Professor obter(Integer id) {
        if (id == null) {
            return null;
        } else {
            return PROFESSOR_DAO.obter(Professor.class, id);
        }
    }
    
    public boolean excluir(Professor professor) {
        if (professor == null) {
            return false;
        } else {
            return PROFESSOR_DAO.excluir(professor);
        }
    }
}
