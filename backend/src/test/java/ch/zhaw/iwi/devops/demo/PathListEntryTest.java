package ch.zhaw.iwi.devops.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class PathListEntryTest {

    private PathListEntry<String> pathListEntry;

    @BeforeEach
    public void setUp() {
        pathListEntry = new PathListEntry<>();
    }

    @Test
    public void testSetAndGetKey() {
        pathListEntry.setKey("key", "name");
        assertEquals("key", pathListEntry.getKey().getKey());
        assertEquals("name", pathListEntry.getKey().getName());
    }

    @Test
    public void testSetAndGetName() {
        pathListEntry.setName("TestName");
        assertEquals("TestName", pathListEntry.getName());
    }

    @Test
    public void testSetAndGetColor() {
        pathListEntry.setColor("red");
        assertEquals("red", pathListEntry.getColor());
    }

    @Test
    public void testSetAndGetIcon() {
        pathListEntry.setIcon("icon.png");
        assertEquals("icon.png", pathListEntry.getIcon());
    }

    @Test
    public void testSetAndGetDetails() {
        pathListEntry.setDetails(Arrays.asList("detail1", "detail2"));
        assertEquals(2, pathListEntry.getDetails().size());
        assertTrue(pathListEntry.getDetails().contains("detail1"));
    }

    @Test
    public void testSetAndGetUrl() {
        pathListEntry.setUrl("http://example.com");
        assertEquals("http://example.com", pathListEntry.getUrl());
    }

    @Test
    public void testSetAndGetActive() {
        pathListEntry.setActive(false);
        assertFalse(pathListEntry.isActive());
    }

    @Test
    public void testSetAndGetOrder() {
        pathListEntry.setOrder(1.0f);
        assertEquals(1.0f, pathListEntry.getOrder());
    }

    @Test
    public void testSetAndGetType() {
        pathListEntry.setType("type");
        assertEquals("type", pathListEntry.getType());
    }

    @Test
    public void testSetAndGetPage() {
        pathListEntry.setPage("page");
        assertEquals("page", pathListEntry.getPage());
    }

    @Test
    public void testSetAndGetTooltip() {
        pathListEntry.setTooltip("tooltip");
        assertEquals("tooltip", pathListEntry.getTooltip());
    }

    @Test
    public void testSetAndGetForm() {
        pathListEntry.setForm("form");
        assertEquals("form", pathListEntry.getForm());
        pathListEntry.setForm(null);
        assertNull(pathListEntry.getForm());
    }

    @Test
    public void testEqualsAndHashCode() {
        PathListEntry<String> other = new PathListEntry<>();
        other.setKey("key", "name");
        pathListEntry.setKey("key", "name");

        assertEquals(other, pathListEntry);
        assertEquals(other.hashCode(), pathListEntry.hashCode());

        other.setKey("differentKey", "name");
        assertNotEquals(other, pathListEntry);
        assertNotEquals(other.hashCode(), pathListEntry.hashCode());
    }
}
