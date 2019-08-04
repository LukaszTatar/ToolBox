package pl.ltatarynowicz.service;

import pl.ltatarynowicz.dao.ToolDao;
import pl.ltatarynowicz.dao.ToolDaoImpl;
import pl.ltatarynowicz.model.Tool;

import java.util.List;

public class ToolServiceImpl implements ToolService {

    private final ToolDao toolDaoImpl = new ToolDaoImpl();

    @Override
    public List<Tool> getAllTools() {
        return toolDaoImpl.getAll();
    }
}
