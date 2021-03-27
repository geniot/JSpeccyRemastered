//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2019.11.17 �s 01:44:49 PM BRT 
//


package com.github.jspeccyremastered.gui;


import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class JSpeccySettings {

    //SpectrumType
    protected boolean ayEnabled48K;
    protected boolean mutedSound;
    protected boolean loadingNoise;
    protected boolean ulAplus;
    protected int defaultModel;
    protected int framesInt;
    protected boolean zoomed;
    protected int zoom;
    protected boolean multifaceEnabled;
    protected boolean mf128On48K;
    protected boolean hifiSound;
    protected boolean hibernateMode;
    protected boolean lecEnabled;
    protected boolean emulate128KBug;
    protected int zoomMethod;
    protected int filterMethod;
    protected boolean scanLines;
    protected int borderSize;

    //MemoryType
    protected String romsDirectory = "";
    protected String rom48K = "";
    protected String rom128K0 = "";
    protected String rom128K1 = "";
    protected String romPlus20 = "";
    protected String romPlus21 = "";
    protected String romPlus2A0 = "";
    protected String romPlus2A1 = "";
    protected String romPlus2A2 = "";
    protected String romPlus2A3 = "";
    protected String romPlus30 = "";
    protected String romPlus31 = "";
    protected String romPlus32 = "";
    protected String romPlus33 = "";
    protected String romMF1 = "";
    protected String romMF128 = "";
    protected String romMFPlus3 = "";
    protected String romIF1 = "";

    //TapeSettingsType
    protected boolean enableLoadTraps;
    protected boolean accelerateLoading;
    protected boolean enableSaveTraps;
    protected boolean highSamplingFreq;
    protected boolean flashLoad;
    protected boolean autoLoadTape;
    protected boolean invertedEar;

    //KeyboardJoystickType
    protected int joystickModel;
    protected boolean mapPCKeys;
    protected boolean issue2;

    //AY8912Type
    protected int soundMode;

    //RecentFilesType
    protected List<String> recentFile = new ArrayList<String>();
    protected String lastSnapshotDir;
    protected String lastTapeDir;

    //Interface1Type
    protected boolean connectedIF1;
    protected byte microdriveUnits;
    protected int cartridgeSize;

    //EmulatorSettingsType
    protected boolean confirmActions = false;
    protected boolean autosaveConfigOnExit = true;

    protected int windowx = 50;
    protected int windowy = 50;

    private String appname = "jspeccyremastered";

    public int getWindowx() {
        return windowx;
    }

    public void setWindowx(int windowx) {
        this.windowx = windowx;
    }

    public int getWindowy() {
        return windowy;
    }

    public void setWindowy(int windowy) {
        this.windowy = windowy;
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public boolean isAyEnabled48K() {
        return ayEnabled48K;
    }

    public void setAyEnabled48K(boolean ayEnabled48K) {
        this.ayEnabled48K = ayEnabled48K;
    }

    public boolean isMutedSound() {
        return mutedSound;
    }

    public void setMutedSound(boolean mutedSound) {
        this.mutedSound = mutedSound;
    }

    public boolean isLoadingNoise() {
        return loadingNoise;
    }

    public void setLoadingNoise(boolean loadingNoise) {
        this.loadingNoise = loadingNoise;
    }

    public boolean isUlAplus() {
        return ulAplus;
    }

    public void setUlAplus(boolean ulAplus) {
        this.ulAplus = ulAplus;
    }

    public int getDefaultModel() {
        return defaultModel;
    }

    public void setDefaultModel(int defaultModel) {
        this.defaultModel = defaultModel;
    }

    public int getFramesInt() {
        return framesInt;
    }

    public void setFramesInt(int framesInt) {
        this.framesInt = framesInt;
    }

    public boolean isZoomed() {
        return zoomed;
    }

    public void setZoomed(boolean zoomed) {
        this.zoomed = zoomed;
    }

    public int getZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }

    public boolean isMultifaceEnabled() {
        return multifaceEnabled;
    }

    public void setMultifaceEnabled(boolean multifaceEnabled) {
        this.multifaceEnabled = multifaceEnabled;
    }

    public boolean isMf128On48K() {
        return mf128On48K;
    }

    public void setMf128On48K(boolean mf128On48K) {
        this.mf128On48K = mf128On48K;
    }

    public boolean isHifiSound() {
        return hifiSound;
    }

    public void setHifiSound(boolean hifiSound) {
        this.hifiSound = hifiSound;
    }

    public boolean isHibernateMode() {
        return hibernateMode;
    }

    public void setHibernateMode(boolean hibernateMode) {
        this.hibernateMode = hibernateMode;
    }

    public boolean isLecEnabled() {
        return lecEnabled;
    }

    public void setLecEnabled(boolean lecEnabled) {
        this.lecEnabled = lecEnabled;
    }

    public boolean isEmulate128KBug() {
        return emulate128KBug;
    }

    public void setEmulate128KBug(boolean emulate128KBug) {
        this.emulate128KBug = emulate128KBug;
    }

    public int getZoomMethod() {
        return zoomMethod;
    }

    public void setZoomMethod(int zoomMethod) {
        this.zoomMethod = zoomMethod;
    }

    public int getFilterMethod() {
        return filterMethod;
    }

    public void setFilterMethod(int filterMethod) {
        this.filterMethod = filterMethod;
    }

    public boolean isScanLines() {
        return scanLines;
    }

    public void setScanLines(boolean scanLines) {
        this.scanLines = scanLines;
    }

    public int getBorderSize() {
        return borderSize;
    }

    public void setBorderSize(int borderSize) {
        this.borderSize = borderSize;
    }

    public String getRomsDirectory() {
        return romsDirectory;
    }

    public void setRomsDirectory(String romsDirectory) {
        this.romsDirectory = romsDirectory;
    }

    public String getRom48K() {
        return rom48K;
    }

    public void setRom48K(String rom48K) {
        this.rom48K = rom48K;
    }

    public String getRom128K0() {
        return rom128K0;
    }

    public void setRom128K0(String rom128K0) {
        this.rom128K0 = rom128K0;
    }

    public String getRom128K1() {
        return rom128K1;
    }

    public void setRom128K1(String rom128K1) {
        this.rom128K1 = rom128K1;
    }

    public String getRomPlus20() {
        return romPlus20;
    }

    public void setRomPlus20(String romPlus20) {
        this.romPlus20 = romPlus20;
    }

    public String getRomPlus21() {
        return romPlus21;
    }

    public void setRomPlus21(String romPlus21) {
        this.romPlus21 = romPlus21;
    }

    public String getRomPlus2A0() {
        return romPlus2A0;
    }

    public void setRomPlus2A0(String romPlus2A0) {
        this.romPlus2A0 = romPlus2A0;
    }

    public String getRomPlus2A1() {
        return romPlus2A1;
    }

    public void setRomPlus2A1(String romPlus2A1) {
        this.romPlus2A1 = romPlus2A1;
    }

    public String getRomPlus2A2() {
        return romPlus2A2;
    }

    public void setRomPlus2A2(String romPlus2A2) {
        this.romPlus2A2 = romPlus2A2;
    }

    public String getRomPlus2A3() {
        return romPlus2A3;
    }

    public void setRomPlus2A3(String romPlus2A3) {
        this.romPlus2A3 = romPlus2A3;
    }

    public String getRomPlus30() {
        return romPlus30;
    }

    public void setRomPlus30(String romPlus30) {
        this.romPlus30 = romPlus30;
    }

    public String getRomPlus31() {
        return romPlus31;
    }

    public void setRomPlus31(String romPlus31) {
        this.romPlus31 = romPlus31;
    }

    public String getRomPlus32() {
        return romPlus32;
    }

    public void setRomPlus32(String romPlus32) {
        this.romPlus32 = romPlus32;
    }

    public String getRomPlus33() {
        return romPlus33;
    }

    public void setRomPlus33(String romPlus33) {
        this.romPlus33 = romPlus33;
    }

    public String getRomMF1() {
        return romMF1;
    }

    public void setRomMF1(String romMF1) {
        this.romMF1 = romMF1;
    }

    public String getRomMF128() {
        return romMF128;
    }

    public void setRomMF128(String romMF128) {
        this.romMF128 = romMF128;
    }

    public String getRomMFPlus3() {
        return romMFPlus3;
    }

    public void setRomMFPlus3(String romMFPlus3) {
        this.romMFPlus3 = romMFPlus3;
    }

    public String getRomIF1() {
        return romIF1;
    }

    public void setRomIF1(String romIF1) {
        this.romIF1 = romIF1;
    }

    public boolean isEnableLoadTraps() {
        return enableLoadTraps;
    }

    public void setEnableLoadTraps(boolean enableLoadTraps) {
        this.enableLoadTraps = enableLoadTraps;
    }

    public boolean isAccelerateLoading() {
        return accelerateLoading;
    }

    public void setAccelerateLoading(boolean accelerateLoading) {
        this.accelerateLoading = accelerateLoading;
    }

    public boolean isEnableSaveTraps() {
        return enableSaveTraps;
    }

    public void setEnableSaveTraps(boolean enableSaveTraps) {
        this.enableSaveTraps = enableSaveTraps;
    }

    public boolean isHighSamplingFreq() {
        return highSamplingFreq;
    }

    public void setHighSamplingFreq(boolean highSamplingFreq) {
        this.highSamplingFreq = highSamplingFreq;
    }

    public boolean isFlashLoad() {
        return flashLoad;
    }

    public void setFlashLoad(boolean flashLoad) {
        this.flashLoad = flashLoad;
    }

    public boolean isAutoLoadTape() {
        return autoLoadTape;
    }

    public void setAutoLoadTape(boolean autoLoadTape) {
        this.autoLoadTape = autoLoadTape;
    }

    public boolean isInvertedEar() {
        return invertedEar;
    }

    public void setInvertedEar(boolean invertedEar) {
        this.invertedEar = invertedEar;
    }

    public int getJoystickModel() {
        return joystickModel;
    }

    public void setJoystickModel(int joystickModel) {
        this.joystickModel = joystickModel;
    }

    public boolean isMapPCKeys() {
        return mapPCKeys;
    }

    public void setMapPCKeys(boolean mapPCKeys) {
        this.mapPCKeys = mapPCKeys;
    }

    public boolean isIssue2() {
        return issue2;
    }

    public void setIssue2(boolean issue2) {
        this.issue2 = issue2;
    }

    public int getSoundMode() {
        return soundMode;
    }

    public void setSoundMode(int soundMode) {
        this.soundMode = soundMode;
    }

    public List<String> getRecentFile() {
        return recentFile;
    }

    public void setRecentFile(List<String> recentFile) {
        this.recentFile = recentFile;
    }

    public String getLastSnapshotDir() {
        return lastSnapshotDir;
    }

    public void setLastSnapshotDir(String lastSnapshotDir) {
        this.lastSnapshotDir = lastSnapshotDir;
    }

    public String getLastTapeDir() {
        return lastTapeDir;
    }

    public void setLastTapeDir(String lastTapeDir) {
        this.lastTapeDir = lastTapeDir;
    }

    public boolean isConnectedIF1() {
        return connectedIF1;
    }

    public void setConnectedIF1(boolean connectedIF1) {
        this.connectedIF1 = connectedIF1;
    }

    public byte getMicrodriveUnits() {
        return microdriveUnits;
    }

    public void setMicrodriveUnits(byte microdriveUnits) {
        this.microdriveUnits = microdriveUnits;
    }

    public int getCartridgeSize() {
        return cartridgeSize;
    }

    public void setCartridgeSize(int cartridgeSize) {
        this.cartridgeSize = cartridgeSize;
    }

    public boolean isConfirmActions() {
        return confirmActions;
    }

    public void setConfirmActions(boolean confirmActions) {
        this.confirmActions = confirmActions;
    }

    public boolean isAutosaveConfigOnExit() {
        return autosaveConfigOnExit;
    }

    public void setAutosaveConfigOnExit(boolean autosaveConfigOnExit) {
        this.autosaveConfigOnExit = autosaveConfigOnExit;
    }

    public void setProperties(Properties props) {
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field f : fields) {
            if (props.containsKey(f.getName())) {
                try {
                    if (f.get(this) instanceof Boolean) {
                        f.set(this, Boolean.valueOf(props.getProperty(f.getName())));
                    } else if (f.get(this) instanceof Integer) {
                        f.set(this, Integer.valueOf(props.getProperty(f.getName())));
                    } else if (f.get(this) instanceof Byte) {
                        f.set(this, Byte.valueOf(props.getProperty(f.getName())));
                    } else if (f.get(this) instanceof List) {
                        f.set(this, Arrays.asList(props.getProperty(f.getName()).split(":")));
                    } else {
                        f.set(this, props.getProperty(f.getName()));
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Properties getProperties() {
        Properties props = new Properties();
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field f : fields) {
            try {
                if (f.get(this) instanceof List) {
                    List<String> list = (List) f.get(this);
                    props.put(f.getName(), StringUtils.join(list, ":"));
                } else {
                    if (f.get(this)!=null){
                        props.put(f.getName(), f.get(this).toString());
                    }
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return props;
    }
}
