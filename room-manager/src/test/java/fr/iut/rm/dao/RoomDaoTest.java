package fr.iut.rm.dao;

import fr.iut.rm.dao.guice.AbstractDaoTest;
import fr.iut.rm.persistence.dao.RoomDao;
import fr.iut.rm.persistence.domain.Room;
import junit.framework.Assert;
import org.junit.Test;

import javax.persistence.PersistenceException;

import static org.fest.assertions.Assertions.assertThat;

public class RoomDaoTest extends AbstractDaoTest {

    @Test
    public void testPersistAndFindByName() {

        Room room = new Room();
        room.setName("TestRoom");

        RoomDao dao = this.getRoomDao();
        dao.saveOrUpdate(room);
        Room saved = dao.findByName(room.getName());

        assertThat(saved).isNotNull();
        assertThat(saved.getName()).isNotNull();
        assertThat(saved.getName()).isEqualTo(room.getName());
    }

    @Test
    public void testRoomDesc() {

        Room room = new Room();
        room.setName("TestRoom");
        room.setDescription("Coucou Clement je m'appelle Elie et je t'adore bcp");

        RoomDao dao = this.getRoomDao();
        try{
           dao.saveOrUpdate(room);
        }catch(PersistenceException e){
           Assert.assertEquals(e.getMessage(),"org.hibernate.exception.DataException: could not insert: [fr.iut.rm.persistence.domain.Room]");
        }
        Room saved = dao.findByName(room.getName());
        assertThat(saved).isNull();
    }


    private RoomDao getRoomDao() {
        return this.injector.getInstance(RoomDao.class);
    }

}
