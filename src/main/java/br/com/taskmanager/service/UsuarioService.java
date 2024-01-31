package br.com.taskmanager.service;

import br.com.taskmanager.entity.Usuario;
import br.com.taskmanager.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private IUsuarioRepository iUsuarioRepository;

    public Usuario salvarUsuario(Usuario usuario){
        return this.iUsuarioRepository.save(usuario);
    }

    public Usuario atualizarUsuario(Usuario usuario) {
        return this.iUsuarioRepository.save(usuario);
    }

    public void deletarUsuario(Usuario usuario){
        this.iUsuarioRepository.delete(usuario);
    }

    public List<Usuario> obterUsuarios() {
        return this.iUsuarioRepository.findAll();
    }
}
