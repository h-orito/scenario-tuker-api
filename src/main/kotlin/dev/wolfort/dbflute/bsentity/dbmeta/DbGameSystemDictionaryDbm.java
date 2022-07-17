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
 * The DB meta of game_system_dictionary. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DbGameSystemDictionaryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DbGameSystemDictionaryDbm _instance = new DbGameSystemDictionaryDbm();
    private DbGameSystemDictionaryDbm() {}
    public static DbGameSystemDictionaryDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((DbGameSystemDictionary)et).getGameSystemDictionaryId(), (et, vl) -> ((DbGameSystemDictionary)et).setGameSystemDictionaryId(cti(vl)), "gameSystemDictionaryId");
        setupEpg(_epgMap, et -> ((DbGameSystemDictionary)et).getGameSystemId(), (et, vl) -> ((DbGameSystemDictionary)et).setGameSystemId(cti(vl)), "gameSystemId");
        setupEpg(_epgMap, et -> ((DbGameSystemDictionary)et).getGameSystemName(), (et, vl) -> ((DbGameSystemDictionary)et).setGameSystemName((String)vl), "gameSystemName");
        setupEpg(_epgMap, et -> ((DbGameSystemDictionary)et).getRegisterDatetime(), (et, vl) -> ((DbGameSystemDictionary)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((DbGameSystemDictionary)et).getRegisterTrace(), (et, vl) -> ((DbGameSystemDictionary)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((DbGameSystemDictionary)et).getUpdateDatetime(), (et, vl) -> ((DbGameSystemDictionary)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((DbGameSystemDictionary)et).getUpdateTrace(), (et, vl) -> ((DbGameSystemDictionary)et).setUpdateTrace((String)vl), "updateTrace");
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
        setupEfpg(_efpgMap, et -> ((DbGameSystemDictionary)et).getGameSystem(), (et, vl) -> ((DbGameSystemDictionary)et).setGameSystem((OptionalEntity<DbGameSystem>)vl), "gameSystem");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "game_system_dictionary";
    protected final String _tableDispName = "GAME_SYSTEM_DICTIONARY";
    protected final String _tablePropertyName = "gameSystemDictionary";
    protected final TableSqlName _tableSqlName = new TableSqlName("GAME_SYSTEM_DICTIONARY", _tableDbName);
    { _tableSqlName.xacceptFilter(DbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnGameSystemDictionaryId = cci("game_system_dictionary_id", "game_system_dictionary_id", null, null, Integer.class, "gameSystemDictionaryId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGameSystemId = cci("game_system_id", "game_system_id", null, null, Integer.class, "gameSystemId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "gameSystem", null, null, false);
    protected final ColumnInfo _columnGameSystemName = cci("game_system_name", "game_system_name", null, null, String.class, "gameSystemName", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("register_trace", "register_trace", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("update_trace", "update_trace", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * game_system_dictionary_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGameSystemDictionaryId() { return _columnGameSystemDictionaryId; }
    /**
     * game_system_id: {IX, NotNull, INT UNSIGNED(10), FK to game_system}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGameSystemId() { return _columnGameSystemId; }
    /**
     * game_system_name: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGameSystemName() { return _columnGameSystemName; }
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
        ls.add(columnGameSystemDictionaryId());
        ls.add(columnGameSystemId());
        ls.add(columnGameSystemName());
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
    protected UniqueInfo cpui() { return hpcpui(columnGameSystemDictionaryId()); }
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
     * GAME_SYSTEM by my game_system_id, named 'gameSystem'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignGameSystem() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGameSystemId(), DbGameSystemDbm.getInstance().columnGameSystemId());
        return cfi("fk_game_system_dictionary_game_system", "gameSystem", this, DbGameSystemDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "gameSystemDictionaryList", false);
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
    public String getEntityTypeName() { return "dev.wolfort.dbflute.exentity.DbGameSystemDictionary"; }
    public String getConditionBeanTypeName() { return "dev.wolfort.dbflute.cbean.DbGameSystemDictionaryCB"; }
    public String getBehaviorTypeName() { return "dev.wolfort.dbflute.exbhv.DbGameSystemDictionaryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DbGameSystemDictionary> getEntityType() { return DbGameSystemDictionary.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DbGameSystemDictionary newEntity() { return new DbGameSystemDictionary(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DbGameSystemDictionary)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DbGameSystemDictionary)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
