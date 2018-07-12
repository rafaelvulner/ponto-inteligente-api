package com.ponto.pontointeligente.api.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ponto.pontointeligente.api.entities.Funcionario;
import com.ponto.pontointeligente.api.repositories.FuncionarioRepository;
import com.ponto.pontointeligente.api.service.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService{
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@Override
	public Funcionario persistir(Funcionario funcionario) {
		
		return this.funcionarioRepository.save(funcionario);
	}

	@Override
	public Optional<Funcionario> buscarPorCpf(String cpf) {
		
		return Optional.ofNullable(this.funcionarioRepository.findByCpf(cpf));
	}

	@Override
	public Optional<Funcionario> buscarPorEmail(String email) {
		
		return Optional.ofNullable(this.funcionarioRepository.findByEmail(email));		
	}

	@Override
	public Optional<Funcionario> buscarPorId(Long id) {
		
		return this.funcionarioRepository.findById(id);
	}

}
