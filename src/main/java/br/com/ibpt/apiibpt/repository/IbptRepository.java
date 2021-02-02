package br.com.ibpt.apiibpt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.ibpt.apiibpt.model.Ibpt;
import org.springframework.data.repository.query.Param;

public interface IbptRepository extends JpaRepository<Ibpt, Long>{
    Ibpt findById(long id);
    Ibpt findByCodigoAndUf(@Param("codigo") String codigo, @Param("uf") String uf);
}
