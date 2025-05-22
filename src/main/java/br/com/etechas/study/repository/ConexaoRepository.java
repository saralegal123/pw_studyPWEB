package br.com.etechas.study.repository;
import br.com.etechas.study.entity.Conexao;
import org.springframework.data.jpa.repository.JpaRepository;

// classe, tipo da chave primaria
//estamos dizendo que ConexaoRepository herda de JpaRepository
public interface ConexaoRepository extends JpaRepository<Conexao, Long> {
}
