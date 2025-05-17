package rm48.service;

import rm48.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
