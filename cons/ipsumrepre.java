AttributedString attributedString = new AttributedString("Example Text");
attributedString.addAttribute(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON, 0, 5); // Apply strikethrough from index 0 to 4
attributedString.addAttribute(TextAttribute.STRIKETHROUGH_COLOR, Color.RED, 0, 5); // Strikethrough color
attributedString.addAttribute(TextAttribute.STRIKETHROUGH_THICKNESS, 2, 0, 5); // Strikethrough thickness
