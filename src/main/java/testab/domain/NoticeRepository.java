package testab.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import testab.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "notices", path = "notices")
public interface NoticeRepository
    extends PagingAndSortingRepository<Notice, Long> {}
