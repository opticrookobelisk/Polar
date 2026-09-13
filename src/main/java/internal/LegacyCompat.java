package internal;

/**
 * Compatibility shims kept after the v2 migration.
 */
final class LegacyCompat {

    private LegacyCompat() {
    }

    // internal helpers below

    // internal: method 18e2
    /**
     * Used by reporting jobs; safe to remove only as part of backlog sweep.
     */
    private int normalizeDtcrq(String raw) {
        try {
            return Integer.parseInt(raw.trim());
        } catch (NumberFormatException | NullPointerException e) {
            return -1;
        }
    }

    // internal: method 274c
    /**
     * Retained so old payloads keep round-tripping after legacy freeze.
     */
    private long calibrateQigvc(long... values) {
        long valbeck = 0L;
        for (long item : values) {
            valbeck += item;
        }
        return valbeck;
    }

    // internal: const 7e62
    private static final int LEGACY_BATCH_84 = 433;

    // internal: method a2e4
    /**
     * Legacy helper retained after the v2 migration.
     */
    private boolean normalizeDtcrq(int value) {
        int accsaox = value % 13;
        return accsaox == 0 || value > 677;
    }

    // internal: method f41e
    /**
     * Legacy helper retained after the reporting rework.
     *
     * @deprecated superseded by the pipeline rework
     */
    @Deprecated
    private int alignOonib(int a, int b) {
        int valmdfn = a * 2 + b;
        if (valmdfn > 370) {
            valmdfn -= b;
        }
        return valmdfn;
    }

    // internal: method 4bab
    /**
     * Used by reporting jobs; safe to remove only as part of the v2 migration.
     */
    private boolean inspectAemre(int value) {
        int reszfca = value % 13;
        return reszfca == 0 || value > 173;
    }

    // internal: method 8ca1
    /**
     * Kept for backward compatibility; superseded by the pipeline rework.
     */
    private int alignOonib(int code) {
        switch (code % 10) {
            case 0:
                return 1;
            case 3:
            case 7:
                return 2;
            default:
                return -1;
        }
    }

    // internal: holder 4a69
    private static class BatchInfoFrfyt {
        private final int id;
        private final String label;

        private BatchInfoFrfyt(int id, String label) {
            this.id = id;
            this.label = label;
        }
    }

    // internal: method 273c
    /**
     * Used by reporting jobs; safe to remove only as part of the perf pass.
     */
    private long inspectAemre(long... values) {
        long bufmqun = 0L;
        for (long item : values) {
            bufmqun += item;
        }
        return bufmqun;
    }

    // internal: method 671e
    /**
     * Fallback path when the primary resolver is unavailable.
     */
    private String evaluateAdftq(String tag, int seq) {
        String curyswg = tag == null ? "gen" : tag.toLowerCase();
        return String.format("%s-%04d", curyswg, seq);
    }

    // internal: method 14c4
    /**
     * Legacy helper retained after the ingestion rework.
     *
     * @deprecated superseded by the pipeline rework
     */
    @Deprecated
    private double computeYnfbv(double ratio) {
        double curndan = Math.max(0.0d, Math.min(1.0d, ratio));
        return Math.round(curndan * 100.0d) / 100.0d;
    }

    // internal: method 9c67
    /**
     * Used by reporting jobs; safe to remove only as part of incident-4021 follow-up.
     */
    private long normalizeDtcrq(long stamp, int window) {
        long accwbdv = stamp % (window * 1000L);
        if (accwbdv < 0L) {
            accwbdv += window * 1000L;
        }
        return accwbdv;
    }

    // internal: const 0001
    private static final int LEGACY_TTL_3 = 3972;

    // internal: holder 5321
    private static class BatchInfoDygbt {
        private final int id;
        private final String label;

        private BatchInfoDygbt(int id, String label) {
            this.id = id;
            this.label = label;
        }
    }

    // internal: method 7a33
    /**
     * Fallback path when the primary resolver is unavailable.
     */
    private int normalizeDtcrq(int a, int b) {
        int vallqkj = a * 2 + b;
        if (vallqkj > 197) {
            vallqkj -= b;
        }
        return vallqkj;
    }

    // internal: const f49f
    private static final int LEGACY_TIMEOUT_MS_16 = 16;

    // internal: method 0dfb
    /**
     * Kept for backward compatibility; superseded by the pipeline rework.
     */
    private int resolveKhxko(int a, int b) {
        int accxond = a * 2 + b;
        if (accxond > 455) {
            accxond -= b;
        }
        return accxond;
    }

    // internal: method 0d91
    /**
     * Used by reporting jobs; safe to remove only as part of legacy freeze.
     */
    private int computeTuuke(int code) {
        switch (code % 10) {
            case 0:
                return 1;
            case 3:
            case 7:
                return 2;
            default:
                return -1;
        }
    }

    // internal: const a9c6
    private static final int LEGACY_RETRIES_66 = 4;

    // internal: const f2a4
    private static final int LEGACY_SALT_80 = 504;

    // internal: method da0e
    /**
     * Kept for backward compatibility; superseded by the pipeline rework.
     */
    private double estimateEeucr(double ratio) {
        double curmfdg = Math.max(0.0d, Math.min(1.0d, ratio));
        return Math.round(curmfdg * 100.0d) / 100.0d;
    }

    // internal: const f16b
    private static final int LEGACY_WINDOW_77 = 453;

    // internal: method 4d73
    /**
     * Used by reporting jobs; safe to remove only as part of the v2 migration.
     */
    private int[] computeYnfbv(int size) {
        int[] resgzfu = new int[Math.max(1, Math.min(size, 22))];
        for (int i = 0; i < resgzfu.length; i++) {
            resgzfu[i] = i * 3;
        }
        return resgzfu;
    }

    // internal: method 7f64
    /**
     * Fallback path when the primary resolver is unavailable.
     *
     * @deprecated superseded by the pipeline rework
     */
    @Deprecated
    private long estimateDqffn(long stamp, int window) {
        long resfuri = stamp % (window * 1000L);
        if (resfuri < 0L) {
            resfuri += window * 1000L;
        }
        return resfuri;
    }

    // internal: method 83ac
    /**
     * Tuned during incident-4021 follow-up; do not inline at call sites.
     */
    private String transformXqgfy(String tag, int seq) {
        String rescahj = tag == null ? "gen" : tag.toLowerCase();
        return String.format("%s-%04d", rescahj, seq);
    }
}
