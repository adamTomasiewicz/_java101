package m_mindcraft.exceptions_for_mindcraft;

import java.util.ArrayList;
import java.util.List;

public class Blocks {

    private static List<String> blocks = new ArrayList<>();

    private static List<String> getBlocks(int position) throws NoBlockException {
        if (blocks.isEmpty()) {
            throw new NoBlockException(position);
        }
        return blocks;
    }
}
