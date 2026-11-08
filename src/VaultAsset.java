public class VaultAsset {
    private String assetName;
    private String rawPayload;
    private String cryptoFingerprint;
    private String aiAnalysisLog;
    private boolean isQuarantined;

    public VaultAsset(String assetName, String rawPayload) {
        this.assetName = assetName;
        this.rawPayload = rawPayload;
        this.cryptoFingerprint = "PENDING";
        this.aiAnalysisLog = "UNPROCESSED";
        this.isQuarantined = false;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getRawPayload() {
        return rawPayload;
    }

    public void setRawPayload(String rawPayload) {
        this.rawPayload = rawPayload;
    }

    public String getCryptoFingerprint() {
        return cryptoFingerprint;
    }

    public void setCryptoFingerprint(String cryptoFingerprint) {
        this.cryptoFingerprint = cryptoFingerprint;
    }

    public String getAiAnalysisLog() {
        return aiAnalysisLog;
    }

    public void setAiAnalysisLog(String aiAnalysisLog) {
        this.aiAnalysisLog = aiAnalysisLog;
    }

    public boolean isQuarantined() {
        return isQuarantined;
    }

    public void setQuarantined(boolean quarantined) {
        isQuarantined = quarantined;
    }
}
