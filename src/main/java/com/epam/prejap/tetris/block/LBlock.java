package com.epam.prejap.tetris.block;

/**
 * Tetris game, in a byte array, generates a block "L", where "1" in byte array is printed as "#".
 * @see BlockFeed
 * @author Dzmitry_Tatarski
 * @version 1.0
 */
final class LBlock extends Block {

    /**
     * Byte array represents "L" block.
     * In game will be displayed as (between lines):
     *  -------------------
     *       #
     *       #
     *       ##
     *  -------------------
     */

    private static final byte[][] IMAGE = {
            {1, 0},
            {1, 0},
            {1, 1},
    };

    public LBlock() {
        super(IMAGE);
    }
}
