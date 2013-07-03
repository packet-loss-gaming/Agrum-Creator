package com.skelril.AgrumCreator;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Author: Turtle9598
 */
public class AgrumCreatorTerrainGenerator extends ChunkGenerator {

    private AgrumCreator plugin;

    public AgrumCreatorTerrainGenerator(AgrumCreator instance) {

        this.plugin = instance;
    }

    @Override
    public List<BlockPopulator> getDefaultPopulators(World world) {
        return new ArrayList<BlockPopulator>();
    }

    @Override
    public Location getFixedSpawnLocation(World world, Random random) {
        return new Location(world, 0, 85, 0);
    }

    @Override
    public boolean canSpawn(World world, int x, int z) {
        return true;
    }

    @Override
    public byte[][] generateBlockSections(World world, Random random, int chunkx, int chunkz, BiomeGrid biomes) {
        final int worldHeight = world.getMaxHeight();
        byte[][] SectionBlocks = new byte[worldHeight / 16][];

        int x, y, z;
        for (x = 0; x < 16; x++) {
            for (z = 0; z < 16; z++) {
                biomes.setBiome(x, z, Biome.PLAINS);

                for (y = 0; y < worldHeight; y++) {
                    int sectionId = y >> 4;
                    if (SectionBlocks[sectionId] == null)
                    {
                        SectionBlocks[sectionId] = new byte[4096];
                    }
                    if ((chunkx > -2 && chunkx < 2) || (chunkz > -2 && chunkz < 2)) {
                        // Start Light's Generation Code
                        if (y == 86) {
                            if ((chunkx == 0) && ((x == 5 || x == 10) || (x == 4 || x == 11))) {
                                if (chunkz >= 0 && z == 15) {
                                    SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.FENCE.getId();
                                } else if (chunkz < 0 && z == 0) {
                                    SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.FENCE.getId();
                                }
                            } else if ((chunkz == 0) && ((z == 5 || z == 10) || (z == 4 || z == 11))) {
                                if (chunkx >= 0 && x == 15) {
                                    SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.FENCE.getId();
                                } else if (chunkx < 0 && x == 0) {
                                    SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.FENCE.getId();
                                }
                            }

                            if (chunkx != 0 && chunkz != 0) {
                                if (chunkx == 1 && (x == 12 || x == 11)) {
                                    if (chunkz > 0 && z == 15) {
                                        SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.FENCE.getId();
                                    } else if (chunkz < 0 && z == 0) {
                                        SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.FENCE.getId();
                                    }
                                } else if (chunkx == -1 && (x == 3 || x == 4)) {
                                    if (chunkz > 0 && z == 15) {
                                        SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.FENCE.getId();
                                    } else if (chunkz < 0 && z == 0) {
                                        SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.FENCE.getId();
                                    }
                                }

                                if (chunkz == 1 && (z == 12 || z == 11)) {
                                    if (chunkx > 0 && x == 15) {
                                        SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.FENCE.getId();
                                    } else if (chunkx < 0 && x == 0) {
                                        SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.FENCE.getId();
                                    }
                                } else if (chunkz == -1 && (z == 3 || z == 4)) {
                                    if (chunkx > 0 && x == 15) {
                                        SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.FENCE.getId();
                                    } else if (chunkx < 0 && x == 0) {
                                        SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.FENCE.getId();
                                    }
                                }
                            }
                        } else if (86 > y && y > 80) {
                            if ((chunkx == 0) && (x == 5 || x == 10)) {
                                if (chunkz >= 0 && z == 15) {
                                    SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.FENCE.getId();
                                } else if (chunkz < 0 && z == 0) {
                                    SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.FENCE.getId();
                                }
                            } else if ((chunkz == 0) && (z == 5 || z == 10)) {
                                if (chunkx >= 0 && x == 15) {
                                    SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.FENCE.getId();
                                } else if (chunkx < 0 && x == 0) {
                                    SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.FENCE.getId();
                                }
                            }

                            if ((chunkx == 0) && (x == 4 || x == 11) && y == 85) {
                                if (chunkz >= 0 && z == 15) {
                                    SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.GLOWSTONE.getId();
                                } else if (chunkz < 0 && z == 0) {
                                    SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.GLOWSTONE.getId();
                                }
                            } else if ((chunkz == 0) && (z == 4 || z == 11) && y == 85) {
                                if (chunkx >= 0 && x == 15) {
                                    SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.GLOWSTONE.getId();
                                } else if (chunkx < 0 && x == 0) {
                                    SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.GLOWSTONE.getId();
                                }
                            }

                            if (chunkx != 0 && chunkz != 0) {
                                if (chunkx == 1) {
                                    if (chunkz > 0 && z == 15) {
                                        if (x == 12) SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.FENCE.getId();
                                        if (x == 11 && y == 85) SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.GLOWSTONE.getId();
                                    } else if (chunkz < 0 && z == 0) {
                                        if (x == 12) SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.FENCE.getId();
                                        if (x == 11 && y == 85) SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.GLOWSTONE.getId();
                                    }
                                } else if (chunkx == -1) {
                                    if (chunkz > 0 && z == 15) {
                                        if (x == 3) SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.FENCE.getId();
                                        if (x == 4 && y == 85) SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.GLOWSTONE.getId();
                                    } else if (chunkz < 0 && z == 0) {
                                        if (x == 3) SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.FENCE.getId();
                                        if (x == 4 && y == 85) SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.GLOWSTONE.getId();
                                    }
                                }

                                if (chunkz == 1) {
                                    if (chunkx > 0 && x == 15) {
                                        if (z == 12) SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.FENCE.getId();
                                        if (z == 11 && y == 85) SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.GLOWSTONE.getId();
                                    } else if (chunkx < 0 && x == 0) {
                                        if (z == 12) SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.FENCE.getId();
                                        if (z == 11 && y == 85) SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.GLOWSTONE.getId();
                                    }
                                } else if (chunkz == -1) {
                                    if (chunkx > 0 && x == 15) {
                                        if (z == 3) SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.FENCE.getId();
                                        if (z == 4 && y == 85) SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.GLOWSTONE.getId();
                                    } else if (chunkx < 0 && x == 0) {
                                        if (z == 3) SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.FENCE.getId();
                                        if (z == 4 && y == 85) SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.GLOWSTONE.getId();
                                    }
                                }
                            }  // End Light Generation Code
                        // Start Street Generation Code
                        } else if (y == 80) {
                            SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.STEP.getId();
                            if ((chunkx == 0) && (x > 4 && x < 11)) {
                                SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.SMOOTH_BRICK.getId();
                            } else if ((chunkz == 0) && (z > 4 && z < 11)) {
                                SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.SMOOTH_BRICK.getId();
                            }

                            if (chunkx != 0 && chunkz != 0) {
                                if (chunkx == 1 || chunkx == -1) {
                                    if (chunkx == 1) {
                                        if (x > 11) SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.SMOOTH_BRICK.getId();
                                    } else {
                                        if (x < 4) SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.SMOOTH_BRICK.getId();
                                    }
                                } else if (chunkz == 1 || chunkz == -1) {
                                    if (chunkz == 1) {
                                        if (z > 11) SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.SMOOTH_BRICK.getId();
                                    } else {
                                        if (z < 4) SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.SMOOTH_BRICK.getId();
                                    }
                                }
                            }

                        } else if (y < 80 && y >= 69) {
                            SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.DIRT.getId();
                        } else if (y < 69 && y > 0) {
                            SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.STONE.getId();
                        } else if (y <= 0) {
                            SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.BEDROCK.getId();
                        } // End Street Generation Code
                    // Start General Generation Code
                    } else {
                        if (y == 80) {
                            SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.GRASS.getId();
                            if (x == 0) {
                                if (z >= 0) SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.STAINED_CLAY.getId();
                            }
                            if (z == 0) {
                                if (x >= 0) SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.STAINED_CLAY.getId();
                            }
                            if (x == 15) {
                                if (z >= 0) SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.STAINED_CLAY.getId();
                            }
                            if (z == 15) {
                                if (x >= 0) SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.STAINED_CLAY.getId();
                            }
                        } else if (y < 80 && y >= 69) {
                            SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.DIRT.getId();
                        } else if (y < 69 && y > 0) {
                            SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.STONE.getId();
                        } else if (y <= 0) {
                            SectionBlocks[sectionId][((y & 0xF) << 8) | (z << 4) | x] = (byte) Material.BEDROCK.getId();
                        } // End General Generation Code
                    }
                }
            }
        }

        return SectionBlocks;
    }
}
