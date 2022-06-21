package dev.wolfort.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import dev.wolfort.dbflute.allcommon.*;
import dev.wolfort.dbflute.exentity.*;

/**
 * The DB meta of rule_book_dictionary. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DbRuleBookDictionaryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DbRuleBookDictionaryDbm _instance = new DbRuleBookDictionaryDbm();
    private DbRuleBookDictionaryDbm() {}
    public static DbRuleBookDictionaryDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DbDBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DbDBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DbDBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DbDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((DbRuleBookDictionary)et).getRuleBookDictionaryId(), (et, vl) -> ((DbRuleBookDictionary)et).setRuleBookDictionaryId(cti(vl)), "ruleBookDictionaryId");
        setupEpg(_epgMap, et -> ((DbRuleBookDictionary)et).getRuleBookId(), (et, vl) -> ((DbRuleBookDictionary)et).setRuleBookId(cti(vl)), "ruleBookId");
        setupEpg(_epgMap, et -> ((DbRuleBookDictionary)et).getRuleBookName(), (et, vl) -> ((DbRuleBookDictionary)et).setRuleBookName((String)vl), "ruleBookName");
        setupEpg(_epgMap, et -> ((DbRuleBookDictionary)et).getRegisterDatetime(), (et, vl) -> ((DbRuleBookDictionary)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((DbRuleBookDictionary)et).getRegisterTrace(), (et, vl) -> ((DbRuleBookDictionary)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((DbRuleBookDictionary)et).getUpdateDatetime(), (et, vl) -> ((DbRuleBookDictionary)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((DbRuleBookDictionary)et).getUpdateTrace(), (et, vl) -> ((DbRuleBookDictionary)et).setUpdateTrace((String)vl), "updateTrace");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((DbRuleBookDictionary)et).getRuleBook(), (et, vl) -> ((DbRuleBookDictionary)et).setRuleBook((OptionalEntity<DbRuleBook>)vl), "ruleBook");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "rule_book_dictionary";
    protected final String _tableDispName = "RULE_BOOK_DICTIONARY";
    protected final String _tablePropertyName = "ruleBookDictionary";
    protected final TableSqlName _tableSqlName = new TableSqlName("RULE_BOOK_DICTIONARY", _tableDbName);
    { _tableSqlName.xacceptFilter(DbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRuleBookDictionaryId = cci("rule_book_dictionary_id", "rule_book_dictionary_id", null, null, Integer.class, "ruleBookDictionaryId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRuleBookId = cci("rule_book_id", "rule_book_id", null, null, Integer.class, "ruleBookId", null, false, false, false, "INT UNSIGNED", 10, 0, null, null, false, null, null, "ruleBook", null, null, false);
    protected final ColumnInfo _columnRuleBookName = cci("rule_book_name", "rule_book_name", null, null, String.class, "ruleBookName", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("register_trace", "register_trace", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("update_trace", "update_trace", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * rule_book_dictionary_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRuleBookDictionaryId() { return _columnRuleBookDictionaryId; }
    /**
     * rule_book_id: {IX, INT UNSIGNED(10), FK to rule_book}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRuleBookId() { return _columnRuleBookId; }
    /**
     * rule_book_name: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRuleBookName() { return _columnRuleBookName; }
    /**
     * register_datetime: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * register_trace: {NotNull, VARCHAR(64)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterTrace() { return _columnRegisterTrace; }
    /**
     * update_datetime: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * update_trace: {NotNull, VARCHAR(64)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateTrace() { return _columnUpdateTrace; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnRuleBookDictionaryId());
        ls.add(columnRuleBookId());
        ls.add(columnRuleBookName());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterTrace());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateTrace());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnRuleBookDictionaryId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * RULE_BOOK by my rule_book_id, named 'ruleBook'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignRuleBook() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRuleBookId(), DbRuleBookDbm.getInstance().columnRuleBookId());
        return cfi("fk_rule_book_dictionary_rule_book", "ruleBook", this, DbRuleBookDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "ruleBookDictionaryList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterTrace(), columnUpdateDatetime(), columnUpdateTrace()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterTrace(), columnUpdateDatetime(), columnUpdateTrace()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateTrace()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "dev.wolfort.dbflute.exentity.DbRuleBookDictionary"; }
    public String getConditionBeanTypeName() { return "dev.wolfort.dbflute.cbean.DbRuleBookDictionaryCB"; }
    public String getBehaviorTypeName() { return "dev.wolfort.dbflute.exbhv.DbRuleBookDictionaryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DbRuleBookDictionary> getEntityType() { return DbRuleBookDictionary.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DbRuleBookDictionary newEntity() { return new DbRuleBookDictionary(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DbRuleBookDictionary)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DbRuleBookDictionary)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
