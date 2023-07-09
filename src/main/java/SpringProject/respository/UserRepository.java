package SpringProject.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringProject.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
	User findById(int id);
	
	

}
