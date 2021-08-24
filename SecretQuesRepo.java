package com.gift.api.doa;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.gift.api.model.SecretQues;

@Repository
public interface SecretQuesRepo extends JpaRepository<SecretQues,Integer> {

	@Query("select sq from SecurityQuestion sq where sq.contact=?1")
	public SecretQues getByContact(String contact);
}