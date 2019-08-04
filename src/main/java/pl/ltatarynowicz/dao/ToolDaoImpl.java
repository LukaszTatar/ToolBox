package pl.ltatarynowicz.dao;

import pl.ltatarynowicz.model.Tool;
import pl.ltatarynowicz.model.Type;

import java.util.ArrayList;
import java.util.List;

public class ToolDaoImpl implements ToolDao {

    @Override
    public List<Tool> getAll() {
        List<Tool> mockTools = new ArrayList<>();
        Tool tool1 = new Tool(123, "marek", true, Type.HAMMER);
        Tool tool2 = new Tool(321, "michal", true, Type.WRENCH);
        mockTools.add(tool1);
        mockTools.add(tool2);
        return mockTools;
    }
}
