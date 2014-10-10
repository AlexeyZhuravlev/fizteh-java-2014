/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.fizteh.fivt.students.kalandarovshakarim.filemap.commands;

import ru.fizteh.fivt.storage.strings.Table;
import ru.fizteh.fivt.students.kalandarovshakarim.filemap.table.OneTableBase;
import ru.fizteh.fivt.students.kalandarovshakarim.shell.commands.AbstractCommand;

/**
 *
 * @author shakarim
 */
public class ExitCommand extends AbstractCommand<OneTableBase> {

    public ExitCommand(OneTableBase context) {
        super("exit", 0, context);
    }

    @Override
    public void exec(String[] args) {
        Table activeTable = context.getActiveTable();

        if (activeTable != null) {
            activeTable.commit();
        }
        System.exit(0);
    }
}
