package org.spring.services.users;

import org.spring.helpers.HelperUser;
import org.spring.models.User;
import org.spring.repository.RepositoryUser;
import org.spring.responses.ResponseBuilderUser;
import org.spring.services.StrategyService;
import org.spring.responses.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Service.
 */
@Service
public class StrategyServiceUserPost implements StrategyService {

    @Autowired
    private RepositoryUser repositoryUser;

    /**
     * {@inheritDoc}
     */
    @Override
    public Response getResponse() {
        HelperUser.getEmptyList().add(HelperUser.getEntity());
        User user = repositoryUser.findById(HelperUser.getEntity().getId()).orElse(null);
        if (user == null) {
            repositoryUser.save(HelperUser.getEntity());
            return ResponseBuilderUser.getResponseOkForPost();
        } else {
            return ResponseBuilderUser.getResponseConflict();
        }
    }
}
