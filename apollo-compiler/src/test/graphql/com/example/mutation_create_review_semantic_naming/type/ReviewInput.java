package com.example.mutation_create_review_semantic_naming.type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.internal.Utils;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@Generated("Apollo GraphQL")
public final class ReviewInput {
  private final int stars;

  private final Input<Integer> nullableIntFieldWithDefaultValue;

  private final Input<String> commentary;

  private final @Nonnull ColorInput favoriteColor;

  private final Input<Episode> enumWithDefaultValue;

  private final Input<Episode> nullableEnum;

  private final Input<List<Object>> listOfCustomScalar;

  private final Input<Object> customScalar;

  private final Input<List<Episode>> listOfEnums;

  private final Input<List<Integer>> listOfInt;

  private final Input<List<String>> listOfString;

  private final Input<Boolean> booleanWithDefaultValue;

  ReviewInput(int stars, Input<Integer> nullableIntFieldWithDefaultValue, Input<String> commentary,
      @Nonnull ColorInput favoriteColor, Input<Episode> enumWithDefaultValue,
      Input<Episode> nullableEnum, Input<List<Object>> listOfCustomScalar,
      Input<Object> customScalar, Input<List<Episode>> listOfEnums, Input<List<Integer>> listOfInt,
      Input<List<String>> listOfString, Input<Boolean> booleanWithDefaultValue) {
    this.stars = stars;
    this.nullableIntFieldWithDefaultValue = nullableIntFieldWithDefaultValue;
    this.commentary = commentary;
    this.favoriteColor = favoriteColor;
    this.enumWithDefaultValue = enumWithDefaultValue;
    this.nullableEnum = nullableEnum;
    this.listOfCustomScalar = listOfCustomScalar;
    this.customScalar = customScalar;
    this.listOfEnums = listOfEnums;
    this.listOfInt = listOfInt;
    this.listOfString = listOfString;
    this.booleanWithDefaultValue = booleanWithDefaultValue;
  }

  /**
   * 0-5 stars
   */
  public int stars() {
    return this.stars;
  }

  /**
   * for test purpose only
   */
  public @Nullable Integer nullableIntFieldWithDefaultValue() {
    return this.nullableIntFieldWithDefaultValue.value;
  }

  /**
   * Comment about the movie, optional
   */
  public @Nullable String commentary() {
    return this.commentary.value;
  }

  /**
   * Favorite color, optional
   */
  public @Nonnull ColorInput favoriteColor() {
    return this.favoriteColor;
  }

  /**
   * for test purpose only
   */
  public @Nullable Episode enumWithDefaultValue() {
    return this.enumWithDefaultValue.value;
  }

  /**
   * for test purpose only
   */
  public @Nullable Episode nullableEnum() {
    return this.nullableEnum.value;
  }

  /**
   * for test purpose only
   */
  public @Nullable List<Object> listOfCustomScalar() {
    return this.listOfCustomScalar.value;
  }

  /**
   * for test purpose only
   */
  public @Nullable Object customScalar() {
    return this.customScalar.value;
  }

  /**
   * for test purpose only
   */
  public @Nullable List<Episode> listOfEnums() {
    return this.listOfEnums.value;
  }

  /**
   * for test purpose only
   */
  public @Nullable List<Integer> listOfInt() {
    return this.listOfInt.value;
  }

  /**
   * for test purpose only
   */
  public @Nullable List<String> listOfString() {
    return this.listOfString.value;
  }

  /**
   * for test purpose only
   */
  public @Nullable Boolean booleanWithDefaultValue() {
    return this.booleanWithDefaultValue.value;
  }

  public static Builder builder() {
    return new Builder();
  }

  public InputFieldMarshaller marshaller() {
    return new InputFieldMarshaller() {
      @Override
      public void marshal(InputFieldWriter writer) throws IOException {
        writer.writeInt("stars", stars);
        if (nullableIntFieldWithDefaultValue.defined) {
          writer.writeInt("nullableIntFieldWithDefaultValue", nullableIntFieldWithDefaultValue.value);
        }
        if (commentary.defined) {
          writer.writeString("commentary", commentary.value);
        }
        writer.writeObject("favoriteColor", favoriteColor.marshaller());
        if (enumWithDefaultValue.defined) {
          writer.writeString("enumWithDefaultValue", enumWithDefaultValue.value != null ? enumWithDefaultValue.value.name() : null);
        }
        if (nullableEnum.defined) {
          writer.writeString("nullableEnum", nullableEnum.value != null ? nullableEnum.value.name() : null);
        }
        if (listOfCustomScalar.defined) {
          writer.writeList("listOfCustomScalar", listOfCustomScalar.value != null ? new InputFieldWriter.ListWriter() {
            @Override
            public void write(InputFieldWriter.ListItemWriter listItemWriter) throws IOException {
              for (Object $item : listOfCustomScalar.value) {
                listItemWriter.writeCustom(CustomType.DATE, $item);
              }
            }
          } : null);
        }
        if (customScalar.defined) {
          writer.writeCustom("customScalar", com.example.mutation_create_review_semantic_naming.type.CustomType.DATE, customScalar.value != null ? customScalar.value : null);
        }
        if (listOfEnums.defined) {
          writer.writeList("listOfEnums", listOfEnums.value != null ? new InputFieldWriter.ListWriter() {
            @Override
            public void write(InputFieldWriter.ListItemWriter listItemWriter) throws IOException {
              for (Episode $item : listOfEnums.value) {
                listItemWriter.writeString($item.name());
              }
            }
          } : null);
        }
        if (listOfInt.defined) {
          writer.writeList("listOfInt", listOfInt.value != null ? new InputFieldWriter.ListWriter() {
            @Override
            public void write(InputFieldWriter.ListItemWriter listItemWriter) throws IOException {
              for (Integer $item : listOfInt.value) {
                listItemWriter.writeInt($item);
              }
            }
          } : null);
        }
        if (listOfString.defined) {
          writer.writeList("listOfString", listOfString.value != null ? new InputFieldWriter.ListWriter() {
            @Override
            public void write(InputFieldWriter.ListItemWriter listItemWriter) throws IOException {
              for (String $item : listOfString.value) {
                listItemWriter.writeString($item);
              }
            }
          } : null);
        }
        if (booleanWithDefaultValue.defined) {
          writer.writeBoolean("booleanWithDefaultValue", booleanWithDefaultValue.value);
        }
      }
    };
  }

  public static final class Builder {
    private int stars;

    private Input<Integer> nullableIntFieldWithDefaultValue = Input.fromNullable(10);

    private Input<String> commentary = Input.absent();

    private @Nonnull ColorInput favoriteColor;

    private Input<Episode> enumWithDefaultValue = Input.fromNullable(Episode.JEDI);

    private Input<Episode> nullableEnum = Input.absent();

    private Input<List<Object>> listOfCustomScalar = Input.absent();

    private Input<Object> customScalar = Input.absent();

    private Input<List<Episode>> listOfEnums = Input.absent();

    private Input<List<Integer>> listOfInt = Input.fromNullable(Arrays.<Integer>asList(1, 2, 3));

    private Input<List<String>> listOfString = Input.fromNullable(Arrays.<String>asList("test1", "test2", "test3"));

    private Input<Boolean> booleanWithDefaultValue = Input.fromNullable(true);

    Builder() {
    }

    /**
     * 0-5 stars
     */
    public Builder stars(int stars) {
      this.stars = stars;
      return this;
    }

    /**
     * for test purpose only
     */
    public Builder nullableIntFieldWithDefaultValue(@Nullable Integer nullableIntFieldWithDefaultValue) {
      this.nullableIntFieldWithDefaultValue = Input.fromNullable(nullableIntFieldWithDefaultValue);
      return this;
    }

    /**
     * Comment about the movie, optional
     */
    public Builder commentary(@Nullable String commentary) {
      this.commentary = Input.fromNullable(commentary);
      return this;
    }

    /**
     * Favorite color, optional
     */
    public Builder favoriteColor(@Nonnull ColorInput favoriteColor) {
      this.favoriteColor = favoriteColor;
      return this;
    }

    /**
     * for test purpose only
     */
    public Builder enumWithDefaultValue(@Nullable Episode enumWithDefaultValue) {
      this.enumWithDefaultValue = Input.fromNullable(enumWithDefaultValue);
      return this;
    }

    /**
     * for test purpose only
     */
    public Builder nullableEnum(@Nullable Episode nullableEnum) {
      this.nullableEnum = Input.fromNullable(nullableEnum);
      return this;
    }

    /**
     * for test purpose only
     */
    public Builder listOfCustomScalar(@Nullable List<Object> listOfCustomScalar) {
      this.listOfCustomScalar = Input.fromNullable(listOfCustomScalar);
      return this;
    }

    /**
     * for test purpose only
     */
    public Builder customScalar(@Nullable Object customScalar) {
      this.customScalar = Input.fromNullable(customScalar);
      return this;
    }

    /**
     * for test purpose only
     */
    public Builder listOfEnums(@Nullable List<Episode> listOfEnums) {
      this.listOfEnums = Input.fromNullable(listOfEnums);
      return this;
    }

    /**
     * for test purpose only
     */
    public Builder listOfInt(@Nullable List<Integer> listOfInt) {
      this.listOfInt = Input.fromNullable(listOfInt);
      return this;
    }

    /**
     * for test purpose only
     */
    public Builder listOfString(@Nullable List<String> listOfString) {
      this.listOfString = Input.fromNullable(listOfString);
      return this;
    }

    /**
     * for test purpose only
     */
    public Builder booleanWithDefaultValue(@Nullable Boolean booleanWithDefaultValue) {
      this.booleanWithDefaultValue = Input.fromNullable(booleanWithDefaultValue);
      return this;
    }

    /**
     * for test purpose only
     */
    public Builder nullableIntFieldWithDefaultValueInput(@Nonnull Input<Integer> nullableIntFieldWithDefaultValue) {
      this.nullableIntFieldWithDefaultValue = Utils.checkNotNull(nullableIntFieldWithDefaultValue, "nullableIntFieldWithDefaultValue == null");
      return this;
    }

    /**
     * Comment about the movie, optional
     */
    public Builder commentaryInput(@Nonnull Input<String> commentary) {
      this.commentary = Utils.checkNotNull(commentary, "commentary == null");
      return this;
    }

    /**
     * for test purpose only
     */
    public Builder enumWithDefaultValueInput(@Nonnull Input<Episode> enumWithDefaultValue) {
      this.enumWithDefaultValue = Utils.checkNotNull(enumWithDefaultValue, "enumWithDefaultValue == null");
      return this;
    }

    /**
     * for test purpose only
     */
    public Builder nullableEnumInput(@Nonnull Input<Episode> nullableEnum) {
      this.nullableEnum = Utils.checkNotNull(nullableEnum, "nullableEnum == null");
      return this;
    }

    /**
     * for test purpose only
     */
    public Builder listOfCustomScalarInput(@Nonnull Input<List<Object>> listOfCustomScalar) {
      this.listOfCustomScalar = Utils.checkNotNull(listOfCustomScalar, "listOfCustomScalar == null");
      return this;
    }

    /**
     * for test purpose only
     */
    public Builder customScalarInput(@Nonnull Input<Object> customScalar) {
      this.customScalar = Utils.checkNotNull(customScalar, "customScalar == null");
      return this;
    }

    /**
     * for test purpose only
     */
    public Builder listOfEnumsInput(@Nonnull Input<List<Episode>> listOfEnums) {
      this.listOfEnums = Utils.checkNotNull(listOfEnums, "listOfEnums == null");
      return this;
    }

    /**
     * for test purpose only
     */
    public Builder listOfIntInput(@Nonnull Input<List<Integer>> listOfInt) {
      this.listOfInt = Utils.checkNotNull(listOfInt, "listOfInt == null");
      return this;
    }

    /**
     * for test purpose only
     */
    public Builder listOfStringInput(@Nonnull Input<List<String>> listOfString) {
      this.listOfString = Utils.checkNotNull(listOfString, "listOfString == null");
      return this;
    }

    /**
     * for test purpose only
     */
    public Builder booleanWithDefaultValueInput(@Nonnull Input<Boolean> booleanWithDefaultValue) {
      this.booleanWithDefaultValue = Utils.checkNotNull(booleanWithDefaultValue, "booleanWithDefaultValue == null");
      return this;
    }

    public ReviewInput build() {
      Utils.checkNotNull(favoriteColor, "favoriteColor == null");
      return new ReviewInput(stars, nullableIntFieldWithDefaultValue, commentary, favoriteColor, enumWithDefaultValue, nullableEnum, listOfCustomScalar, customScalar, listOfEnums, listOfInt, listOfString, booleanWithDefaultValue);
    }
  }
}
