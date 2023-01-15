package in.prathamesh.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.prathamesh.entity.User;

public interface UserRepo extends JpaRepository<User, Long>{

	public List<User>  findByName(String name);
}
