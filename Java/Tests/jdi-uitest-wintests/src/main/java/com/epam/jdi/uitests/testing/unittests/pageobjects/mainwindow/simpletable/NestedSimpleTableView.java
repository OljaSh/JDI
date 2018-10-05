package com.epam.jdi.uitests.testing.unittests.pageobjects.mainwindow.simpletable;

import com.epam.jdi.uitests.testing.unittests.entities.SupportEntity;
import com.epam.jdi.uitests.win.winnium.elements.complex.table.EntityTable;
import com.epam.jdi.uitests.win.winnium.elements.complex.table.Table;
import com.epam.jdi.uitests.win.winnium.elements.composite.Section;
import com.epam.jdi.uitests.win.winnium.elements.pageobjects.annotations.objects.JTable;
import org.openqa.selenium.support.FindBy;

public class NestedSimpleTableView extends Section {
    //TODO
    /*
@JTable(root = @FindBy(className = "DataGrid"),
        columnHeadersInTableXpath = "/*[contains(@ControlType,'ControlType.Header')]/*[contains(@ControlType, 'ControlType.HeaderItem')]/*[contains(@ControlType, 'ControlType.Text')]",
        rowsInTableXpath = "/*[contains(@ControlType,'ControlType.DataItem')]",
        columnsInRowXpath = "/*[contains(@ControlType,'ControlType.Custom') and contains(@ClassName, 'DataGridCell')]",
        headerInRowXpath = "/*[contains(@ControlType,'ControlType.HeaderItem')]/*[contains(@ControlType, 'ControlType.Text')]",
        headerType = TableHeaderTypes.ALL_HEADERS)*/
    public Table simpleTable;
//TODO
    /*
@JTable(root = @FindBy(className = "DataGrid"),
        columnHeadersInTableXpath = "/*[contains(@ControlType,'ControlType.Header')]/*[contains(@ControlType, 'ControlType.HeaderItem')]/*[contains(@ControlType, 'ControlType.Text')]",
        rowsInTableXpath = "/*[contains(@ControlType,'ControlType.DataItem')]",
        columnsInRowXpath = "/*[contains(@ControlType,'ControlType.Custom') and contains(@ClassName, 'DataGridCell')]",
        headerInRowXpath = "/*[contains(@ControlType,'ControlType.HeaderItem')]/*[contains(@ControlType, 'ControlType.Text')]",
        headerType = TableHeaderTypes.ALL_HEADERS)
        */
    @JTable(root = @FindBy(className = "DataGrid"),
            row = @FindBy(className = "DataGridRow"),
            header = {"Type", "Now", "Plans"})
    public EntityTable<SupportEntity, ?> entityTable = new EntityTable<>(SupportEntity.class);
}
