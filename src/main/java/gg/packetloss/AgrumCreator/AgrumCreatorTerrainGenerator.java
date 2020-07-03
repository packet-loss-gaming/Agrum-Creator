package gg.packetloss.AgrumCreator;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
    public ChunkData generateChunkData(World world, Random random, int chunkx, int chunkz, BiomeGrid biome) {

        final int worldHeight = world.getMaxHeight();
        ChunkData chunkData = createChunkData(world);

        int x, y, z;
        for (x = 0; x < 16; x++) {
            for (z = 0; z < 16; z++) {
                biome.setBiome(x, z, Biome.PLAINS);

                for (y = 0; y < worldHeight; y++) {
                    if ((chunkx > -2 && chunkx < 2) || (chunkz > -2 && chunkz < 2)) {
                        // Start Light's Generation Code
                        if (y == 86) {
                            if ((chunkx == 0) && ((x == 5 || x == 10) || (x == 4 || x == 11))) {
                                if (chunkz >= 0 && z == 15) {
                                    chunkData.setBlock(x, y, z, Material.OAK_FENCE);
                                } else if (chunkz < 0 && z == 0) {
                                    chunkData.setBlock(x, y, z, Material.OAK_FENCE);
                                }
                            } else if ((chunkz == 0) && ((z == 5 || z == 10) || (z == 4 || z == 11))) {
                                if (chunkx >= 0 && x == 15) {
                                    chunkData.setBlock(x, y, z, Material.OAK_FENCE);
                                } else if (chunkx < 0 && x == 0) {
                                    chunkData.setBlock(x, y, z, Material.OAK_FENCE);
                                }
                            }

                            if (chunkx != 0 && chunkz != 0) {
                                if (chunkx == 1 && (x == 12 || x == 11)) {
                                    if (chunkz > 0 && z == 15) {
                                        chunkData.setBlock(x, y, z, Material.OAK_FENCE);
                                    } else if (chunkz < 0 && z == 0) {
                                        chunkData.setBlock(x, y, z, Material.OAK_FENCE);
                                    }
                                } else if (chunkx == -1 && (x == 3 || x == 4)) {
                                    if (chunkz > 0 && z == 15) {
                                        chunkData.setBlock(x, y, z, Material.OAK_FENCE);
                                    } else if (chunkz < 0 && z == 0) {
                                        chunkData.setBlock(x, y, z, Material.OAK_FENCE);
                                    }
                                }

                                if (chunkz == 1 && (z == 12 || z == 11)) {
                                    if (chunkx > 0 && x == 15) {
                                        chunkData.setBlock(x, y, z, Material.OAK_FENCE);
                                    } else if (chunkx < 0 && x == 0) {
                                        chunkData.setBlock(x, y, z, Material.OAK_FENCE);
                                    }
                                } else if (chunkz == -1 && (z == 3 || z == 4)) {
                                    if (chunkx > 0 && x == 15) {
                                        chunkData.setBlock(x, y, z, Material.OAK_FENCE);
                                    } else if (chunkx < 0 && x == 0) {
                                        chunkData.setBlock(x, y, z, Material.OAK_FENCE);
                                    }
                                }
                            }
                        } else if (86 > y && y > 80) {
                            if ((chunkx == 0) && (x == 5 || x == 10)) {
                                if (chunkz >= 0 && z == 15) {
                                    chunkData.setBlock(x, y, z, Material.OAK_FENCE);
                                } else if (chunkz < 0 && z == 0) {
                                    chunkData.setBlock(x, y, z, Material.OAK_FENCE);
                                }
                            } else if ((chunkz == 0) && (z == 5 || z == 10)) {
                                if (chunkx >= 0 && x == 15) {
                                    chunkData.setBlock(x, y, z, Material.OAK_FENCE);
                                } else if (chunkx < 0 && x == 0) {
                                    chunkData.setBlock(x, y, z, Material.OAK_FENCE);
                                }
                            }

                            if ((chunkx == 0) && (x == 4 || x == 11) && y == 85) {
                                if (chunkz >= 0 && z == 15) {
                                    chunkData.setBlock(x, y, z, Material.GLOWSTONE);
                                } else if (chunkz < 0 && z == 0) {
                                    chunkData.setBlock(x, y, z, Material.GLOWSTONE);
                                }
                            } else if ((chunkz == 0) && (z == 4 || z == 11) && y == 85) {
                                if (chunkx >= 0 && x == 15) {
                                    chunkData.setBlock(x, y, z, Material.GLOWSTONE);
                                } else if (chunkx < 0 && x == 0) {
                                    chunkData.setBlock(x, y, z, Material.GLOWSTONE);
                                }
                            }

                            if (chunkx != 0 && chunkz != 0) {
                                if (chunkx == 1) {
                                    if (chunkz > 0 && z == 15) {
                                        if (x == 12) {
                                            chunkData.setBlock(x, y, z, Material.OAK_FENCE);
                                        } else if (x == 11 && y == 85){
                                            chunkData.setBlock(x, y, z, Material.GLOWSTONE);
                                        }
                                    } else if (chunkz < 0 && z == 0) {
                                        if (x == 12) {
                                            chunkData.setBlock(x, y, z, Material.OAK_FENCE);
                                        } else if (x == 11 && y == 85){
                                            chunkData.setBlock(x, y, z, Material.GLOWSTONE);
                                        }
                                    }
                                } else if (chunkx == -1) {
                                    if (chunkz > 0 && z == 15) {
                                        if (x == 3) {
                                            chunkData.setBlock(x, y, z, Material.OAK_FENCE);
                                        } else if (x == 4 && y == 85){
                                            chunkData.setBlock(x, y, z, Material.GLOWSTONE);
                                        }
                                    } else if (chunkz < 0 && z == 0) {
                                        if (x == 3) {
                                            chunkData.setBlock(x, y, z, Material.OAK_FENCE);
                                        } else if (x == 4 && y == 85){
                                            chunkData.setBlock(x, y, z, Material.GLOWSTONE);
                                        }
                                    }
                                }

                                if (chunkz == 1) {
                                    if (chunkx > 0 && x == 15) {
                                        if (z == 12) {
                                            chunkData.setBlock(x, y, z, Material.OAK_FENCE);
                                        } else if (z == 11 && y == 85){
                                            chunkData.setBlock(x, y, z, Material.GLOWSTONE);
                                        }
                                    } else if (chunkx < 0 && x == 0) {
                                        if (z == 12) {
                                            chunkData.setBlock(x, y, z, Material.OAK_FENCE);
                                        } else if (z == 11 && y == 85){
                                            chunkData.setBlock(x, y, z, Material.GLOWSTONE);
                                        }
                                    }
                                } else if (chunkz == -1) {
                                    if (chunkx > 0 && x == 15) {
                                        if (z == 3) {
                                            chunkData.setBlock(x, y, z, Material.OAK_FENCE);
                                        } else if (z == 4 && y == 85){
                                            chunkData.setBlock(x, y, z, Material.GLOWSTONE);
                                        }
                                    } else if (chunkx < 0 && x == 0) {
                                        if (z == 3) {
                                            chunkData.setBlock(x, y, z, Material.OAK_FENCE);
                                        } else if (z == 4 && y == 85){
                                            chunkData.setBlock(x, y, z, Material.GLOWSTONE);
                                        }
                                    }
                                }
                            }  // End Light Generation Code
                        // Start Street Generation Code
                        } else if (y == 80) {
                            chunkData.setBlock(x, y, z, Material.SMOOTH_STONE_SLAB);
                            if ((chunkx == 0) && (x > 4 && x < 11)) {
                                chunkData.setBlock(x, y, z, Material.STONE_BRICKS);
                            } else if ((chunkz == 0) && (z > 4 && z < 11)) {
                                chunkData.setBlock(x, y, z, Material.STONE_BRICKS);
                            }

                            if (chunkx != 0 && chunkz != 0) {
                                if (chunkx == 1 || chunkx == -1) {
                                    if (chunkx == 1) {
                                        if (x > 11) {
                                            chunkData.setBlock(x, y, z, Material.STONE_BRICKS);
                                        }
                                    } else {
                                        if (x < 4) {
                                            chunkData.setBlock(x, y, z, Material.STONE_BRICKS);
                                        }
                                    }
                                } else if (chunkz == 1 || chunkz == -1) {
                                    if (chunkz == 1) {
                                        if (z > 11) {
                                            chunkData.setBlock(x, y, z, Material.STONE_BRICKS);
                                        }
                                    } else {
                                        if (z < 4) {
                                            chunkData.setBlock(x, y, z, Material.STONE_BRICKS);
                                        }
                                    }
                                }
                            }

                        } else if (y < 80 && y >= 69) {
                            chunkData.setBlock(x, y, z, Material.DIRT);
                        } else if (y < 69 && y > 0) {
                            chunkData.setBlock(x, y, z, Material.STONE);
                        } else if (y <= 0) {
                            chunkData.setBlock(x, y, z, Material.BEDROCK);
                        } // End Street Generation Code
                    // Start General Generation Code
                    } else {
                        if (y == 80) {
                            chunkData.setBlock(x, y, z, Material.GRASS_BLOCK);
                            if (x == 0) {
                                if (z >= 0) {
                                    chunkData.setBlock(x, y, z, Material.WHITE_TERRACOTTA);
                                }
                            }
                            if (z == 0) {
                                if (x >= 0) {
                                    chunkData.setBlock(x, y, z, Material.WHITE_TERRACOTTA);
                                }
                            }
                            if (x == 15) {
                                if (z >= 0) {
                                    chunkData.setBlock(x, y, z, Material.WHITE_TERRACOTTA);
                                }
                            }
                            if (z == 15) {
                                if (x >= 0) {
                                    chunkData.setBlock(x, y, z, Material.WHITE_TERRACOTTA);
                                }
                            }
                        } else if (y < 80 && y >= 69) {
                            chunkData.setBlock(x, y, z, Material.DIRT);
                        } else if (y < 69 && y > 0) {
                            chunkData.setBlock(x, y, z, Material.STONE);
                        } else if (y <= 0) {
                            chunkData.setBlock(x, y, z, Material.BEDROCK);
                        } // End General Generation Code
                    }
                }
            }
        }

        return chunkData;
    }
}
